package FutureLogistics;
public class Utility {

    public boolean validateTransportId(String transportId) {
        if (!transportId.matches("RTS\\d{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
        return true;
    }

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        if (!validateTransportId(data[0]))
            return null;

        String type = data[3];

        if (type.equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    data[0], data[1], Integer.parseInt(data[2]),
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        } else {
            return new TimberTransport(
                    data[0], data[1], Integer.parseInt(data[2]),
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
    }

    public String findObjectType(GoodsTransport obj) {
        if (obj instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}
