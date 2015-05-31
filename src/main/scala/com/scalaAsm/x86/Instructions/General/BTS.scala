package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Bit Test and Set
// Category: general/bit

trait BTS extends InstructionDefinition {
  val mnemonic = "BTS"
}

object BTS extends TwoOperands[BTS] with BTSImpl

trait BTSImpl extends BTS {
  implicit object BTS_0 extends _2[rm16, r16] {
    val opcode: TwoOpcodes = (0x0F, 0xAB) /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BTS_1 extends _2[rm32, r32] {
    val opcode: TwoOpcodes = (0x0F, 0xAB) /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BTS_2 extends _2[rm64, r64] {
    val opcode: TwoOpcodes = (0x0F, 0xAB) /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object BTS_3 extends _2[rm16, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 5
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object BTS_4 extends _2[rm32, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 5
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object BTS_5 extends _2[rm64, imm8] {
    val opcode: TwoOpcodes = (0x0F, 0xBA) /+ 5
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }
}
