.class LE3/M4$c;
.super LF3/x;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE3/M4;->A0(LE3/N6;)LF3/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Landroid/os/Handler;

.field final synthetic g:LE3/N6;

.field final synthetic h:I


# direct methods
.method constructor <init>(IIILjava/lang/String;Landroid/os/Handler;LE3/N6;I)V
    .locals 0

    .line 1
    iput-object p5, p0, LE3/M4$c;->f:Landroid/os/Handler;

    .line 2
    .line 3
    iput-object p6, p0, LE3/M4$c;->g:LE3/N6;

    .line 4
    .line 5
    iput p7, p0, LE3/M4$c;->h:I

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, LF3/x;-><init>(IIILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic e(LE3/N6;II)V
    .locals 3

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LE3/N6;->k(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x22

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/16 v0, -0x64

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq p1, v0, :cond_9

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    if-eq p1, v0, :cond_7

    .line 25
    .line 26
    if-eq p1, v2, :cond_5

    .line 27
    .line 28
    const/16 v0, 0x64

    .line 29
    .line 30
    if-eq p1, v0, :cond_3

    .line 31
    .line 32
    const/16 v0, 0x65

    .line 33
    .line 34
    if-eq p1, v0, :cond_1

    .line 35
    .line 36
    new-instance p0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string p2, "onAdjustVolume: Ignoring unknown direction: "

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "VolumeProviderCompat"

    .line 54
    .line 55
    invoke-static {p1, p0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, LE3/N6;->o1()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    xor-int/2addr p1, v2

    .line 70
    invoke-virtual {p0, p1, p2}, LE3/N6;->F(ZI)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    invoke-virtual {p0}, LE3/N6;->o1()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    xor-int/2addr p1, v2

    .line 79
    invoke-virtual {p0, p1}, LE3/N6;->e0(Z)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    const/4 v0, 0x0

    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0, v0, p2}, LE3/N6;->F(ZI)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    invoke-virtual {p0, v0}, LE3/N6;->e0(Z)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, p2}, LE3/N6;->N(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    invoke-virtual {p0}, LE3/N6;->i0()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_7
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_8

    .line 117
    .line 118
    invoke-virtual {p0, p2}, LE3/N6;->X(I)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_8
    invoke-virtual {p0}, LE3/N6;->M()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_9
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_a

    .line 131
    .line 132
    invoke-virtual {p0, v2, p2}, LE3/N6;->F(ZI)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_a
    invoke-virtual {p0, v2}, LE3/N6;->e0(Z)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public static synthetic f(LE3/N6;II)V
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LE3/N6;->k(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x21

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0, v1}, LE3/N6;->k(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, LE3/N6;->z0(II)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, p1}, LE3/N6;->S0(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/M4$c;->f:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LE3/M4$c;->g:LE3/N6;

    .line 4
    .line 5
    iget v2, p0, LE3/M4$c;->h:I

    .line 6
    .line 7
    new-instance v3, LE3/P4;

    .line 8
    .line 9
    invoke-direct {v3, v1, p1, v2}, LE3/P4;-><init>(LE3/N6;II)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/M4$c;->f:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LE3/M4$c;->g:LE3/N6;

    .line 4
    .line 5
    iget v2, p0, LE3/M4$c;->h:I

    .line 6
    .line 7
    new-instance v3, LE3/O4;

    .line 8
    .line 9
    invoke-direct {v3, v1, p1, v2}, LE3/O4;-><init>(LE3/N6;II)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v3}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
