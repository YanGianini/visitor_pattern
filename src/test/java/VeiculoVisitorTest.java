import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoVisitorTest {

    @Test
    void deveCalcularIPVAMoto() {
        Motocicleta motocicleta = new Motocicleta("KML5589", "CG", 2019, 5000f);
        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals(250, visitor.calcularIPVA(motocicleta));
    }

    @Test
    void deveCalcularIPVAAuto() {
        Automovel automovel = new Automovel("KML5589", "CG", 2019, 50000f);
        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals(3500, visitor.calcularIPVA(automovel));
    }

}
