package facade;

public class TurnOnnOffComputerFacade {

	private AlimentadorCorriente acorriente;
	private FirmwareMotherboard firmware;
	
	public TurnOnnOffComputerFacade(AlimentadorCorriente acorriente, FirmwareMotherboard firmware) {
		super();
		this.acorriente = acorriente;
		this.firmware = firmware;
	}

	public void encenderOrdenador(){
		acorriente.suministrarCorriente();
		firmware.ejecutarPOST();
		firmware.ejecutarBootstrap();
		firmware.cargarSistemaOperativo();
	}
	
	public void apagarOrdenador() {
		firmware.getBootstrap().getSoseleccionado().apagar();
		acorriente.cancelarSuministro();
	}
	
}
