package emp.fileupload;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
public class FileUploadController {

		@Autowired
		FileUploadService service;

		// get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
		@RequestMapping(value = "/upload.do", method = RequestMethod.GET)
		public String showPage() {
			// messag
			return "upload/form";
		}

		// post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ��� ����
		@RequestMapping(value = "/upload.do", method = RequestMethod.POST)
		public ModelAndView upload(HttpServletRequest req, FileUploadDTO fileInfo) throws Exception {
			MultipartFile file = fileInfo.getUpFile();
			String path = WebUtils.getRealPath(req.getSession().getServletContext(), "/upload");
			System.out.println("���ε�� ������ ���=>" + path);
			String fileName=file.getOriginalFilename();
			service.uplaod(file, path, fileName);
			return new ModelAndView("index");
		}

}
