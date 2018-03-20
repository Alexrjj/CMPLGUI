import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelWriter {

    public static void main(String[] args) throws IOException {
        String file = "C:/gomnet.xlsx";
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet ws = wb.getSheetAt(0);
        // Código abaixo serve para iterar todas as linhas / colunas da planilha. Talvez sirva para o código/qtd
        /* Iterator<Row> objIterator = ws.rowIterator();
        Row row = objIterator.next();
        Cell user = row.getCell(0);
        Cell pass = row.getCell(1);

        System.out.println(user);
        System.out.println(pass);
        */
        // Salva as células A1 e A2 como variáveis, contendo login e senha
        Cell user = wb.getSheetAt(0).getRow(0).getCell(0);
        Cell pass = wb.getSheetAt(0).getRow(1).getCell(0);

        System.out.println(user);
        System.out.println(pass);
    }
}
