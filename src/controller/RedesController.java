package controller;

public class RedesController {
	public RedesController() {
		super();
	}
	
	private String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void ip() {
		String proc = "";
		String os = os();
		if(os.contains("Windows")) {
			proc = "ipconfig";
		}else if(os.contains("Linux")) {
			proc = "ip addr";
		}
		if(os.contains("Windows")) {
			try {
				Runtime.getRuntime().exec(proc);
			} catch (Exception e){
				String msg = e.getMessage();
				System.err.println(msg);
			}
		} else if(os.contains("Linux")) {
			
		} else {
			System.out.println("Sistema não suportado.");
		}
	}
}
