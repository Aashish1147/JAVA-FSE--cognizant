import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

  test("should return repository names for techiesyed", async () => {

    const data = [
      { id: 1, name: "Repo1" },
      { id: 2, name: "Repo2" }
    ];

    axios.get.mockResolvedValue({
      data
    });

    const result = await GitClient.getRepositories("techiesyed");

    expect(result.data).toEqual(data);

    expect(axios.get).toHaveBeenCalledWith(
      "https://api.github.com/users/techiesyed/repos"
    );

  });

});