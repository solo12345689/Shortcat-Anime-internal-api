.class public LBe/k;
.super LBe/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final i:Lye/E;

.field private final j:Lye/f;

.field private final k:Lqf/v0;

.field private l:Ljf/k;

.field private m:Ljava/util/Set;

.field private n:Lye/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lye/m;LXe/f;Lye/E;Lye/f;Ljava/util/Collection;Lye/h0;ZLpf/n;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p2, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p3, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    if-nez p4, :cond_3

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 23
    .line 24
    .line 25
    :cond_3
    if-nez p5, :cond_4

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 29
    .line 30
    .line 31
    :cond_4
    if-nez p6, :cond_5

    .line 32
    .line 33
    const/4 v0, 0x5

    .line 34
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 35
    .line 36
    .line 37
    :cond_5
    if-nez p8, :cond_6

    .line 38
    .line 39
    const/4 v0, 0x6

    .line 40
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 41
    .line 42
    .line 43
    :cond_6
    move-object v1, p0

    .line 44
    move-object v3, p1

    .line 45
    move-object v4, p2

    .line 46
    move-object v5, p6

    .line 47
    move v6, p7

    .line 48
    move-object v2, p8

    .line 49
    invoke-direct/range {v1 .. v6}, LBe/j;-><init>(Lpf/n;Lye/m;LXe/f;Lye/h0;Z)V

    .line 50
    .line 51
    .line 52
    iput-object p3, v1, LBe/k;->i:Lye/E;

    .line 53
    .line 54
    iput-object p4, v1, LBe/k;->j:Lye/f;

    .line 55
    .line 56
    new-instance p1, Lqf/u;

    .line 57
    .line 58
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 59
    .line 60
    invoke-direct {p1, p0, p2, p5, v2}, Lqf/u;-><init>(Lye/e;Ljava/util/List;Ljava/util/Collection;Lpf/n;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v1, LBe/k;->k:Lqf/v0;

    .line 64
    .line 65
    return-void
.end method

.method private static synthetic F0(I)V
    .locals 6

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    .line 8
    .line 9
    :goto_0
    const/4 v1, 0x2

    .line 10
    packed-switch p0, :pswitch_data_1

    .line 11
    .line 12
    .line 13
    :pswitch_2
    const/4 v2, 0x3

    .line 14
    goto :goto_1

    .line 15
    :pswitch_3
    move v2, v1

    .line 16
    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    packed-switch p0, :pswitch_data_2

    .line 22
    .line 23
    .line 24
    const-string v5, "containingDeclaration"

    .line 25
    .line 26
    aput-object v5, v2, v4

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :pswitch_4
    const-string v5, "kotlinTypeRefiner"

    .line 30
    .line 31
    aput-object v5, v2, v4

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :pswitch_5
    aput-object v3, v2, v4

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :pswitch_6
    const-string v5, "constructors"

    .line 38
    .line 39
    aput-object v5, v2, v4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :pswitch_7
    const-string v5, "unsubstitutedMemberScope"

    .line 43
    .line 44
    aput-object v5, v2, v4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :pswitch_8
    const-string v5, "storageManager"

    .line 48
    .line 49
    aput-object v5, v2, v4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :pswitch_9
    const-string v5, "source"

    .line 53
    .line 54
    aput-object v5, v2, v4

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :pswitch_a
    const-string v5, "supertypes"

    .line 58
    .line 59
    aput-object v5, v2, v4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :pswitch_b
    const-string v5, "kind"

    .line 63
    .line 64
    aput-object v5, v2, v4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :pswitch_c
    const-string v5, "modality"

    .line 68
    .line 69
    aput-object v5, v2, v4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :pswitch_d
    const-string v5, "name"

    .line 73
    .line 74
    aput-object v5, v2, v4

    .line 75
    .line 76
    :goto_2
    const-string v4, "getUnsubstitutedMemberScope"

    .line 77
    .line 78
    const/4 v5, 0x1

    .line 79
    packed-switch p0, :pswitch_data_3

    .line 80
    .line 81
    .line 82
    :pswitch_e
    aput-object v3, v2, v5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :pswitch_f
    const-string v3, "getSealedSubclasses"

    .line 86
    .line 87
    aput-object v3, v2, v5

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :pswitch_10
    const-string v3, "getDeclaredTypeParameters"

    .line 91
    .line 92
    aput-object v3, v2, v5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :pswitch_11
    const-string v3, "getVisibility"

    .line 96
    .line 97
    aput-object v3, v2, v5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :pswitch_12
    const-string v3, "getModality"

    .line 101
    .line 102
    aput-object v3, v2, v5

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :pswitch_13
    const-string v3, "getKind"

    .line 106
    .line 107
    aput-object v3, v2, v5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :pswitch_14
    const-string v3, "getStaticScope"

    .line 111
    .line 112
    aput-object v3, v2, v5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :pswitch_15
    aput-object v4, v2, v5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :pswitch_16
    const-string v3, "getConstructors"

    .line 119
    .line 120
    aput-object v3, v2, v5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :pswitch_17
    const-string v3, "getTypeConstructor"

    .line 124
    .line 125
    aput-object v3, v2, v5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :pswitch_18
    const-string v3, "getAnnotations"

    .line 129
    .line 130
    aput-object v3, v2, v5

    .line 131
    .line 132
    :goto_3
    packed-switch p0, :pswitch_data_4

    .line 133
    .line 134
    .line 135
    const-string v3, "<init>"

    .line 136
    .line 137
    aput-object v3, v2, v1

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :pswitch_19
    aput-object v4, v2, v1

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :pswitch_1a
    const-string v3, "initialize"

    .line 144
    .line 145
    aput-object v3, v2, v1

    .line 146
    .line 147
    :goto_4
    :pswitch_1b
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    packed-switch p0, :pswitch_data_5

    .line 152
    .line 153
    .line 154
    :pswitch_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 155
    .line 156
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :pswitch_1d
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_5
    throw p0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
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
    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
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
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_e
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_1a
        :pswitch_1a
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_19
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1c
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
        :pswitch_1d
    .end packed-switch
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public D()Lye/d;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/k;->n:Lye/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public I0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final K0(Ljf/k;Ljava/util/Set;Lye/d;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p2, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    iput-object p1, p0, LBe/k;->l:Ljf/k;

    .line 15
    .line 16
    iput-object p2, p0, LBe/k;->m:Ljava/util/Set;

    .line 17
    .line 18
    iput-object p3, p0, LBe/k;->n:Lye/d;

    .line 19
    .line 20
    return-void
.end method

.method public V()Lye/r0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public Y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public g0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getAnnotations()Lze/h;
    .locals 2

    .line 1
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x9

    .line 10
    .line 11
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public getVisibility()Lye/u;
    .locals 2

    .line 1
    sget-object v0, Lye/t;->e:Lye/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public h()Lye/f;
    .locals 2

    .line 1
    iget-object v0, p0, LBe/k;->j:Lye/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public i()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, LBe/k;->m:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0xb

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public j0(Lrf/g;)Ljf/k;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 p1, 0xc

    .line 4
    .line 5
    invoke-static {p1}, LBe/k;->F0(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, LBe/k;->l:Ljf/k;

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    invoke-static {v0}, LBe/k;->F0(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-object p1
.end method

.method public l()Lqf/v0;
    .locals 2

    .line 1
    iget-object v0, p0, LBe/k;->k:Lqf/v0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public o0()Ljf/k;
    .locals 2

    .line 1
    sget-object v0, Ljf/k$b;->b:Ljf/k$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0xe

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public p0()Lye/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x12

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public r()Lye/E;
    .locals 2

    .line 1
    iget-object v0, p0, LBe/k;->i:Lye/E;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method

.method public s()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "class "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LBe/a;->getName()LXe/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public z()Ljava/util/Collection;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x13

    .line 6
    .line 7
    invoke-static {v1}, LBe/k;->F0(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object v0
.end method
