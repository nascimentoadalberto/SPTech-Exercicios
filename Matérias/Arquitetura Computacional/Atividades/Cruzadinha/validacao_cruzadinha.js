// vetores com as letras e palavras
var cpu = (document.getElementById(cpu_cs_conexao).value + document.getElementById(cpu_letra_2).value + document.getElementById(quadcore_cpu_conexao).value)
var ula = (document.getElementById(ula_letra_1).value + document.getElementById(ula_letra_2).value + document.getElementById(ula_adressbus_conexao).value)
var registradores = (document.getElementById(memoriamassa_registradores_conexao).value + document.getElementById(registradores_letra_2).value + document.getElementById(registradores_letra_3).value + document.getElementById(registradores_i5_i7_conexao).value + document.getElementById(registradores_letra_5).value + document.getElementById(registradores_letra_6).value + document.getElementById(registradores_letra_7).value + document.getElementById(registradores_letra_8).value + document.getElementById(registradores_letra_9).value + document.getElementById(registradores_eprom_conexao).value + document.getElementById(registradores_letra_11).value, document.getElementById(registradores_letra_12).value, document.getElementById(registradores_adressbus_conexao).value)
var ram = (document.getElementById(ram_letra_1).value + document.getElementById(dma_ram_conexao).value + document.getElementById(ram_memoriamassa_conexao).value)
var rom = (document.getElementById(rom_dualcore_conexao).value + document.getElementById(rom_letra_2).value + document.getElementById(rom_letra_3).value)
var eprom = (document.getElementById(eprom_letra_1).value + document.getElementById(eprom_letra_2).value + document.getElementById(eprom_letra_3).value + document.getElementById(registradores_eprom_conexao).value + document.getElementById(eprom_letra_5).value)
var flash = (document.getElementById(flash_letra_1).value + document.getElementById(flash_letra_2).value + document.getElementById(flash_letra_3).value + document.getElementById(flash_memoriamassa_conexao).value + document.getElementById(flash_letra_5).value)
var memoriamassa = (document.getElementById(memoriamassa_letra_2).value + document.getElementById(memoriamassa_letra_3).value + document.getElementById(memoriamassa_letra_4).value + document.getElementById(memoriamassa_registradores_conexao).value + document.getElementById(memoriamassa_letra_6).value + document.getElementById(memoriamassa_letra_7).value + document.getElementById(memoriamassa_letra_8).value + document.getElementById(quadcore_memoriamassa_conexao).value + document.getElementById(memoriamassa_letra_10).value + document.getElementById(memoriamassa_letra_11).value + document.getElementById(memoriamassa_letra_12).value + document.getElementById(flash_memoriamassa_conexao).value + document.getElementById(memoriamassa_letra_14).value)
var dma = (document.getElementById(dma_letra_1).value + document.getElementById(dma_letra_2).value + document.getElementById(dma_ram_conexao).value)
var cs = (document.getElementById(cpu_cs_conexao).value + document.getElementById(cs_letra_2).value)
var addressbus = (document.getElementById(ula_adressbus_conexao).value + document.getElementById(adressbus_letra_2).value + document.getElementById(adressbus_letra_3).value + document.getElementById(adressbus_letra_4).value + document.getElementById(adressbus_databus_conexao).value + document.getElementById(adressbuss_letra_6).value + document.getElementById(adressbus_letra_7).value + document.getElementById(adressbus_letra_8).value + document.getElementById(registradores_adressbus_conexao).value)
var databus = (document.getElementById(databus_dualcore_conexao).value + document.getElementById(databus_letra_2).value + document.getElementById(databus_letra_3).value + document.getElementById(databus_letra_4).value + document.getElementById(databus_letra_5).value + document.getElementById(databus_letra_6).value + document.getElementById(adressbus_databus_conexao).value)
var i5 = (document.getElementById(i5_letra_2).value + document.getElementById(registradores_i5_i7_conexao).value)
var i7 = (document.getElementById(i7_letra_2).value + document.getElementById(registradores_i5_i7_conexao).value)
var dualcore = (document.getElementById(databus_dualcore_conexao).value + document.getElementById(dualcore_letra_3).value + document.getElementById(dualcore_letra_4).value + document.getElementById(dualcore_letra_5).value + document.getElementById(dualcore_letra_6).value + document.getElementById(dualcore_letra_7).value + document.getElementById(rom_dualcore_conexao).value)
var quadcore = (document.getElementById(quadcore_letra_1).value + document.getElementById(quadcore_cpu_conexao).value + document.getElementById(quadcore_letra_3).value + document.getElementById(quadcore_letra_4).value + document.getElementById(quadcore_letra_5).value + document.getElementById(quadcore_letra_6).value + document.getElementById(quadcore_letra_7).value + document.getElementById(quadcore_memoriamassa_conexao).value)

function verificacao_inicial() {
    if (cpu == "cpu") {
        document.getElementByClassName(cpu_input).style = "background-color: green;"
        console.log(cpu)
    } else {
        document.getElementByClassName(cpu_input).style = "background-color: red;"
    }
    if (ula == "ula") {
        document.getElementByClassName(ula_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(ula_input).style = "background-color: red;"
    }
    if (registradores == "registradores") {
        document.getElementByClassName(registradores_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(registradores_input).style = "background-color: red;"
    }
    if (ram == "ram") {
        document.getElementByClassName(ram_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(ram_input).style = "background-color: red;"
    }
    if (rom == "rom") {
        document.getElementByClassName(rom_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(rom_input).style = "background-color: red;"
    }
    if (eprom == "eprom") {
        document.getElementByClassName(eprom_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(eprom_input).style = "background-color: red;"
    }
    if (flash == "flash") {
        document.getElementByClassName(flash_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(flash_input).style = "background-color: red;"
    }
    if (memoriamassa == "memóriademassa") {
        document.getElementByClassName(memoriamassa_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(memoriamassa_input).style = "background-color: red;"
    }
    if (dma == "dma") {
        document.getElementByClassName(dma_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(dma_input).style = "background-color: red;"
    }
    if (cs == "cs") {
        document.getElementByClassName(cs_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(cs_input).style = "background-color: red;"
    }
    if (adressbus == "adressbus") {
        document.getElementByClassName(adressbus_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(adressbus_input).style = "background-color: red;"
    }
    if (databus == "databus") {
        document.getElementByClassName(cpu_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(cpu_input).style = "background-color: red;"
    }
    if (i5 == "i5") {
        document.getElementByClassName(i5_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(i5_input).style = "background-color: red;"
    }
    if (i7 == "i7") {
        document.getElementByClassName(i7_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(i7_input).style = "background-color: red;"
    }
    if (dualcore == "dualcore") {
        document.getElementByClassName(dualcore_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(dualcore_input).style = "background-color: red;"
    }
    if (quadcore == "quadcore") {
        document.getElementByClassName(quadcore_input).style = "background-color: green;"
    } else {
        document.getElementByClassName(quadcore_input).style = "background-color: red;"
    }
}