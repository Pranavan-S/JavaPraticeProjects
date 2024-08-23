package abstract_factory_0;
//client
public class PhotoEditorApp {
	FilterFactory ff;
	BlurFilter bf;
	SharpenFilter sf;
	EdgeDetectFilter edf;
	
	PhotoEditorApp(FilterFactory ff){
		this.ff = ff;
		bf = ff.createBlurFilter();
		sf = ff.createSharpenFilter();
		edf = ff.createEdgeDetectFilter();
	}
	
	public Image blur(Image img) {
		return bf.apply(img);
	}
	public Image sharpen(Image img) {
		return sf.apply(img);
	}
	public Image detectEdge(Image img) {
		return edf.apply(img);
	}
}
