.class public Lbh/d;
.super Ljava/lang/Object;

# interfaces
.implements LFg/b;


# static fields
.field private static final g:[S

.field private static final h:[S

.field private static final i:[S

.field public static final j:Lbh/d;

.field public static final k:Lbh/d;

.field public static final l:Lbh/d;

.field public static final m:Lbh/d;

.field public static final n:Lbh/d;

.field public static final o:Lbh/d;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:Lbh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v6, v0, [S

    .line 4
    .line 5
    fill-array-data v6, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v6, Lbh/d;->g:[S

    .line 9
    .line 10
    const/16 v0, 0xb

    .line 11
    .line 12
    new-array v12, v0, [S

    .line 13
    .line 14
    fill-array-data v12, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v12, Lbh/d;->h:[S

    .line 18
    .line 19
    const/4 v0, 0x7

    .line 20
    new-array v0, v0, [S

    .line 21
    .line 22
    fill-array-data v0, :array_2

    .line 23
    .line 24
    .line 25
    sput-object v0, Lbh/d;->i:[S

    .line 26
    .line 27
    new-instance v1, Lbh/d;

    .line 28
    .line 29
    new-instance v7, LHg/h;

    .line 30
    .line 31
    const/16 v9, 0x80

    .line 32
    .line 33
    invoke-direct {v7, v9}, LHg/h;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v8, Lbh/c$a;

    .line 37
    .line 38
    const/16 v10, 0x280

    .line 39
    .line 40
    const v11, 0x8000

    .line 41
    .line 42
    .line 43
    invoke-direct {v8, v10, v11}, Lbh/c$a;-><init>(II)V

    .line 44
    .line 45
    .line 46
    const-string v2, "frodokem640aes"

    .line 47
    .line 48
    const/16 v3, 0x280

    .line 49
    .line 50
    const/16 v4, 0xf

    .line 51
    .line 52
    const/4 v5, 0x2

    .line 53
    invoke-direct/range {v1 .. v8}, Lbh/d;-><init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Lbh/d;->j:Lbh/d;

    .line 57
    .line 58
    new-instance v1, Lbh/d;

    .line 59
    .line 60
    new-instance v7, LHg/h;

    .line 61
    .line 62
    invoke-direct {v7, v9}, LHg/h;-><init>(I)V

    .line 63
    .line 64
    .line 65
    new-instance v8, Lbh/c$b;

    .line 66
    .line 67
    invoke-direct {v8, v10, v11}, Lbh/c$b;-><init>(II)V

    .line 68
    .line 69
    .line 70
    const-string v2, "frodokem640shake"

    .line 71
    .line 72
    invoke-direct/range {v1 .. v8}, Lbh/d;-><init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V

    .line 73
    .line 74
    .line 75
    sput-object v1, Lbh/d;->k:Lbh/d;

    .line 76
    .line 77
    new-instance v7, Lbh/d;

    .line 78
    .line 79
    new-instance v13, LHg/h;

    .line 80
    .line 81
    const/16 v1, 0x100

    .line 82
    .line 83
    invoke-direct {v13, v1}, LHg/h;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v14, Lbh/c$a;

    .line 87
    .line 88
    const/16 v2, 0x3d0

    .line 89
    .line 90
    const/high16 v3, 0x10000

    .line 91
    .line 92
    invoke-direct {v14, v2, v3}, Lbh/c$a;-><init>(II)V

    .line 93
    .line 94
    .line 95
    const-string v8, "frodokem976aes"

    .line 96
    .line 97
    const/16 v9, 0x3d0

    .line 98
    .line 99
    const/16 v10, 0x10

    .line 100
    .line 101
    const/4 v11, 0x3

    .line 102
    invoke-direct/range {v7 .. v14}, Lbh/d;-><init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V

    .line 103
    .line 104
    .line 105
    sput-object v7, Lbh/d;->l:Lbh/d;

    .line 106
    .line 107
    new-instance v7, Lbh/d;

    .line 108
    .line 109
    new-instance v13, LHg/h;

    .line 110
    .line 111
    invoke-direct {v13, v1}, LHg/h;-><init>(I)V

    .line 112
    .line 113
    .line 114
    new-instance v14, Lbh/c$b;

    .line 115
    .line 116
    invoke-direct {v14, v2, v3}, Lbh/c$b;-><init>(II)V

    .line 117
    .line 118
    .line 119
    const-string v8, "frodokem976shake"

    .line 120
    .line 121
    invoke-direct/range {v7 .. v14}, Lbh/d;-><init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V

    .line 122
    .line 123
    .line 124
    sput-object v7, Lbh/d;->m:Lbh/d;

    .line 125
    .line 126
    new-instance v13, Lbh/d;

    .line 127
    .line 128
    new-instance v2, LHg/h;

    .line 129
    .line 130
    invoke-direct {v2, v1}, LHg/h;-><init>(I)V

    .line 131
    .line 132
    .line 133
    new-instance v4, Lbh/c$a;

    .line 134
    .line 135
    const/16 v5, 0x540

    .line 136
    .line 137
    invoke-direct {v4, v5, v3}, Lbh/c$a;-><init>(II)V

    .line 138
    .line 139
    .line 140
    const-string v14, "frodokem1344aes"

    .line 141
    .line 142
    const/16 v15, 0x540

    .line 143
    .line 144
    const/16 v16, 0x10

    .line 145
    .line 146
    const/16 v17, 0x4

    .line 147
    .line 148
    move-object/from16 v18, v0

    .line 149
    .line 150
    move-object/from16 v19, v2

    .line 151
    .line 152
    move-object/from16 v20, v4

    .line 153
    .line 154
    invoke-direct/range {v13 .. v20}, Lbh/d;-><init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V

    .line 155
    .line 156
    .line 157
    sput-object v13, Lbh/d;->n:Lbh/d;

    .line 158
    .line 159
    new-instance v13, Lbh/d;

    .line 160
    .line 161
    new-instance v0, LHg/h;

    .line 162
    .line 163
    invoke-direct {v0, v1}, LHg/h;-><init>(I)V

    .line 164
    .line 165
    .line 166
    new-instance v1, Lbh/c$b;

    .line 167
    .line 168
    invoke-direct {v1, v5, v3}, Lbh/c$b;-><init>(II)V

    .line 169
    .line 170
    .line 171
    const-string v14, "frodokem1344shake"

    .line 172
    .line 173
    move-object/from16 v19, v0

    .line 174
    .line 175
    move-object/from16 v20, v1

    .line 176
    .line 177
    invoke-direct/range {v13 .. v20}, Lbh/d;-><init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V

    .line 178
    .line 179
    .line 180
    sput-object v13, Lbh/d;->o:Lbh/d;

    .line 181
    .line 182
    return-void

    .line 183
    :array_0
    .array-data 2
        0x1223s
        0x3433s
        0x5063s
        0x64f3s
        0x722bs
        0x79a9s
        0x7d67s
        0x7f0ds
        0x7fb1s
        0x7fe9s
        0x7ffas
        0x7ffes
        0x7fffs
    .end array-data

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    nop

    .line 201
    :array_1
    .array-data 2
        0x1606s
        0x3e2bs
        0x5c89s
        0x6f9bs
        0x798cs
        0x7dd9s
        0x7f65s
        0x7fdbs
        0x7ff8s
        0x7ffes
        0x7fffs
    .end array-data

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    nop

    .line 217
    :array_2
    .array-data 2
        0x23b6s
        0x5ba6s
        0x7682s
        0x7e69s
        0x7fd5s
        0x7ffds
        0x7fffs
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;III[SLFg/q;Lbh/c;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbh/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lbh/d;->b:I

    .line 7
    .line 8
    iput p3, p0, Lbh/d;->c:I

    .line 9
    .line 10
    iput p4, p0, Lbh/d;->d:I

    .line 11
    .line 12
    mul-int/lit8 p1, p4, 0x40

    .line 13
    .line 14
    iput p1, p0, Lbh/d;->e:I

    .line 15
    .line 16
    new-instance v0, Lbh/a;

    .line 17
    .line 18
    move v1, p2

    .line 19
    move v2, p3

    .line 20
    move v3, p4

    .line 21
    move-object v4, p5

    .line 22
    move-object v5, p6

    .line 23
    move-object v6, p7

    .line 24
    invoke-direct/range {v0 .. v6}, Lbh/a;-><init>(III[SLFg/q;Lbh/c;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lbh/d;->f:Lbh/a;

    .line 28
    .line 29
    return-void
.end method
