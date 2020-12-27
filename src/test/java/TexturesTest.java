/*
 * MojangAPI
 * Copyright (c) 2019  Pau Machetti Vallverdú
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import me.PauMAVA.MojangAPI.MojangAPI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TexturesTest {

    private MojangAPI mojangAPI;

    public TexturesTest() {
        this.mojangAPI = new MojangAPI();
    }


    @Test
    void testTextures() {
        assertEquals("http://textures.minecraft.net/texture/a4776c280c2aebad1d5f18c0738ebc079551df1c1e6ea94298b2e863e58f24b0", this.mojangAPI.getPlayerInfoHandler().getPlayerProfile("GoldLord_").getTextures().getSkin().getUrl());
        assertEquals("c7M2woPcd4aaFdDdqxRLjGXGsGqSGDbKFc8dLymHiyugESTsauvTgkrDkcdBbBy6EdZmuWWYEb49nA7YF87Op+jhK+vHyOVRDhBQ8stfgkH+qeev54L2xCOezaKiX3XVlHC/uxfbH0W3m5PD9SX+VVhrS0zGy/bxJ9TksHYZdGV8gmWtrB8Ume0v1JbcAXeB9jCL9PKBVwkkDGV7CSAAf6yLTe3ogiHtXAdo4k41NYf5QYO86MOYRO102oe2qAoS0N8p6WlaMlOtBMMMvYVVdkIC3nkYEBcL2APjpNZVe4Q1i3mIBuswDzKrQu5khceovGUS3cbINyYEaS8INDMH/xc9F8W/mmUodz/dWbFDaK2HKdB2ZwUsMyU0FgfvdXC72t+ENKBsHRBF0K23Fb3w9zS4SMyXixcxm7apztvd5okNE0MChe24ATnRovDebxloLadXDFx65Mal+5ivMBEJAhG6pUKmkZmRjjObhAqTz2IzocoAFuFTtDBiETXdZNswRHqy8xx8a3gKiwsFSXE4jEIrAcp8DykjT6yjI/t2zC2DNuyzfWsPpKQZ+Lj+wtA38x3qwqWF8LEvwjdvID30/Nz4QAsByjTBT+WZzxPaYviUClc/OWiTcObjaYe3R2nBDlJ20bCrJx0rYLVQ9Z21VpX1DZ9nWa1E/k3fVZtydmM=", this.mojangAPI.getPlayerInfoHandler().getRawPlayerProfile("GoldLord_").getProperties().get(0).getSignature());
    }
}
