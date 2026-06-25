.class final LU/H$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/H$a;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:La1/f0;

.field final synthetic e:LB/m;

.field final synthetic f:Z

.field final synthetic g:Lkotlin/jvm/functions/Function2;

.field final synthetic h:Lkotlin/jvm/functions/Function2;

.field final synthetic i:Lkotlin/jvm/functions/Function2;

.field final synthetic j:Lkotlin/jvm/functions/Function2;

.field final synthetic k:Lkotlin/jvm/functions/Function2;

.field final synthetic l:Lkotlin/jvm/functions/Function2;

.field final synthetic m:Lkotlin/jvm/functions/Function2;

.field final synthetic n:LU/f0;

.field final synthetic o:Ls0/E1;


# direct methods
.method constructor <init>(Ljava/lang/String;ZZLa1/f0;LB/m;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU/f0;Ls0/E1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/H$a$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, LU/H$a$b;->b:Z

    .line 4
    .line 5
    iput-boolean p3, p0, LU/H$a$b;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LU/H$a$b;->d:La1/f0;

    .line 8
    .line 9
    iput-object p5, p0, LU/H$a$b;->e:LB/m;

    .line 10
    .line 11
    iput-boolean p6, p0, LU/H$a$b;->f:Z

    .line 12
    .line 13
    iput-object p7, p0, LU/H$a$b;->g:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    iput-object p8, p0, LU/H$a$b;->h:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    iput-object p9, p0, LU/H$a$b;->i:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    iput-object p10, p0, LU/H$a$b;->j:Lkotlin/jvm/functions/Function2;

    .line 20
    .line 21
    iput-object p11, p0, LU/H$a$b;->k:Lkotlin/jvm/functions/Function2;

    .line 22
    .line 23
    iput-object p12, p0, LU/H$a$b;->l:Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    iput-object p13, p0, LU/H$a$b;->m:Lkotlin/jvm/functions/Function2;

    .line 26
    .line 27
    iput-object p14, p0, LU/H$a$b;->n:LU/f0;

    .line 28
    .line 29
    iput-object p15, p0, LU/H$a$b;->o:Ls0/E1;

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x6

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    invoke-interface {v1, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x2

    .line 20
    :goto_0
    or-int v2, p3, v2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v2, p3

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v4, v2, 0x13

    .line 26
    .line 27
    const/16 v5, 0x12

    .line 28
    .line 29
    if-ne v4, v5, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, LY/m;->i()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-interface {v1}, LY/m;->K()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    const/4 v4, -0x1

    .line 49
    const-string v5, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)"

    .line 50
    .line 51
    const v6, 0x57e4c9cd

    .line 52
    .line 53
    .line 54
    invoke-static {v6, v2, v4, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    sget-object v4, LU/G;->a:LU/G;

    .line 58
    .line 59
    move v5, v2

    .line 60
    iget-object v2, v0, LU/H$a$b;->a:Ljava/lang/String;

    .line 61
    .line 62
    iget-boolean v7, v0, LU/H$a$b;->b:Z

    .line 63
    .line 64
    move v12, v5

    .line 65
    iget-boolean v5, v0, LU/H$a$b;->c:Z

    .line 66
    .line 67
    iget-object v13, v0, LU/H$a$b;->d:La1/f0;

    .line 68
    .line 69
    iget-object v9, v0, LU/H$a$b;->e:LB/m;

    .line 70
    .line 71
    iget-boolean v8, v0, LU/H$a$b;->f:Z

    .line 72
    .line 73
    iget-object v14, v0, LU/H$a$b;->g:Lkotlin/jvm/functions/Function2;

    .line 74
    .line 75
    iget-object v15, v0, LU/H$a$b;->h:Lkotlin/jvm/functions/Function2;

    .line 76
    .line 77
    iget-object v6, v0, LU/H$a$b;->i:Lkotlin/jvm/functions/Function2;

    .line 78
    .line 79
    move/from16 v16, v12

    .line 80
    .line 81
    iget-object v12, v0, LU/H$a$b;->j:Lkotlin/jvm/functions/Function2;

    .line 82
    .line 83
    move-object/from16 v17, v13

    .line 84
    .line 85
    iget-object v13, v0, LU/H$a$b;->k:Lkotlin/jvm/functions/Function2;

    .line 86
    .line 87
    move-object/from16 v18, v14

    .line 88
    .line 89
    iget-object v14, v0, LU/H$a$b;->l:Lkotlin/jvm/functions/Function2;

    .line 90
    .line 91
    move-object/from16 v19, v15

    .line 92
    .line 93
    iget-object v15, v0, LU/H$a$b;->m:Lkotlin/jvm/functions/Function2;

    .line 94
    .line 95
    iget-object v10, v0, LU/H$a$b;->n:LU/f0;

    .line 96
    .line 97
    move-object v11, v6

    .line 98
    new-instance v6, LU/H$a$b$a;

    .line 99
    .line 100
    move-object/from16 v20, v11

    .line 101
    .line 102
    iget-object v11, v0, LU/H$a$b;->o:Ls0/E1;

    .line 103
    .line 104
    invoke-direct/range {v6 .. v11}, LU/H$a$b$a;-><init>(ZZLB/m;LU/f0;Ls0/E1;)V

    .line 105
    .line 106
    .line 107
    const/16 v11, 0x36

    .line 108
    .line 109
    const v0, 0x7db22be0

    .line 110
    .line 111
    .line 112
    move-object/from16 v21, v2

    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    invoke-static {v0, v2, v6, v1, v11}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    shl-int/lit8 v2, v16, 0x3

    .line 120
    .line 121
    and-int/lit8 v2, v2, 0x70

    .line 122
    .line 123
    move-object/from16 v11, v20

    .line 124
    .line 125
    move/from16 v20, v2

    .line 126
    .line 127
    move-object/from16 v2, v21

    .line 128
    .line 129
    const/high16 v21, 0xd80000

    .line 130
    .line 131
    const v22, 0x8000

    .line 132
    .line 133
    .line 134
    move-object/from16 v6, v17

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    move-object/from16 v16, v10

    .line 139
    .line 140
    move-object/from16 v10, v19

    .line 141
    .line 142
    move-object/from16 v19, v1

    .line 143
    .line 144
    move-object v1, v4

    .line 145
    move v4, v7

    .line 146
    move-object v7, v9

    .line 147
    move-object/from16 v9, v18

    .line 148
    .line 149
    move-object/from16 v18, v0

    .line 150
    .line 151
    invoke-virtual/range {v1 .. v22}, LU/G;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLa1/f0;LB/k;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU/f0;LC/A;Lkotlin/jvm/functions/Function2;LY/m;III)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, LY/w;->L()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-static {}, LY/w;->T()V

    .line 161
    .line 162
    .line 163
    :cond_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    check-cast p2, LY/m;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0, p1, p2, p3}, LU/H$a$b;->a(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 12
    .line 13
    .line 14
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method
