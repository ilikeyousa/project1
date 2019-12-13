package com.zking.asset.book.contorller;

import com.zking.asset.book.model.Book;
import com.zking.asset.book.model.BookFile;
import com.zking.asset.book.service.IBookFileService;
import com.zking.asset.book.vo.BookFileVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
@RequestMapping("/bookFile")
public class BookFileController {

    @Autowired
    private IBookFileService bookFileService;

    private static final String DEFAULE_PATH="/uploadss";
    /**
     * 文件上传
     * @return
     */
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request,BookFileVo bookFileVo){
        try {
            //获取图片文件信息
            MultipartFile bookFile=bookFileVo.getBookFile();
            log.info("FileNmae={}",bookFile.getOriginalFilename());
            log.info("Filetype={}",bookFile.getContentType());
            log.info("bookid={}",bookFileVo.getId());


            //2.新增书本文件信息
            bookFileVo.setContentType(bookFile.getContentType());
            bookFileVo.setRealName(bookFile.getOriginalFilename());
            //3.根据书本id修改书本对应的书本图片信息
            Book book=new Book();
            book.setId(bookFileVo.getId());
            bookFileService.insert(bookFileVo,book);

            //1.将上传的文件保存到指定位置
            String relativePath=DEFAULE_PATH+ File.separator+bookFileVo.getRealName();
            //将相对路径转换为绝对路径
            String absolutePath=this.transforPath(request,relativePath);

            bookFile.transferTo(new File(absolutePath));

            return "redirect:/Book/Booklist";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 文件下载
     * @return
     */
    @RequestMapping(value="/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request,@RequestParam String fileId){

        try {
            //先根据文件id查询对应图片信息
            BookFile bookFile=bookFileService.selectByPrimaryKey(fileId);

            String relativePath=DEFAULE_PATH+ File.separator+bookFile.getRealName();
            //将相对路径转换为绝对路径
            String absolutePath=this.transforPath(request,relativePath);

            //下载关键代码
            File file=new File(absolutePath);
            HttpHeaders headers = new HttpHeaders();//http头信息
            String downloadFileName = new String(bookFile.getRealName().getBytes("UTF-8"),"iso-8859-1");//设置编码
            headers.setContentDispositionFormData("attachment", downloadFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 将相对路径装换为绝对路径
     * @param request
     * @param relativePath
     * @return
     */
    private String transforPath(HttpServletRequest request,String relativePath){
        return request.getServletContext().getRealPath(relativePath);
    }
}
