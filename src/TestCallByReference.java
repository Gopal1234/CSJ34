class Train
{
	private long trainNumber;
	private String trainName;
	private String trainSource;
	private String traindestination;
	public long getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTraindestination() {
		return traindestination;
	}
	public void setTraindestination(String traindestination) {
		this.traindestination = traindestination;
	}
	
}

class TrainService
{
	public Train updateTrain(Train train)
	{
		train.setTrainSource("kolkata");
		train.setTraindestination("new delhi");
		return train;
	}
}
public class TestCallByReference {

	
	public static void main(String[] args) {

 Train train=new Train();
   train.setTrainNumber(1234);
   train.setTrainName("Rajdhani express");
   train.setTrainSource("Delhi");
   train.setTraindestination("kolkata");
   System.out.println("before update:"+ " "+train.getTrainSource()+ " "+train.getTraindestination()+" "+train.getTrainName());
TrainService service=new TrainService();
Train trainObj=service.updateTrain(train);
System.out.println(trainObj.getTrainSource()+ " "+trainObj.getTraindestination()+ " "+trainObj.getTrainName());
	}

}
