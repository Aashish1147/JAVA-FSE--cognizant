import { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    const result = (Number(rupees) / 90).toFixed(2);
    setEuro(result);

    alert("Converting to Euro Amount is " + result);
  };

  return (
    <div style={{ marginTop: "30px" }}>
      <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>

      <form onSubmit={handleSubmit}>

        <p>
          Amount :
          <input
            type="number"
            value={rupees}
            onChange={(e) => setRupees(e.target.value)}
          />
        </p>

        <p>
          Currency :
          <input value="Euro" readOnly />
        </p>

        <button type="submit">
          Submit
        </button>

      </form>
    </div>
  );
}

export default CurrencyConvertor;