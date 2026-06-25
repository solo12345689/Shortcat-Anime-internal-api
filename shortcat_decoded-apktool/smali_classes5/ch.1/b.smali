.class Lch/b;
.super Ljava/lang/Object;


# instance fields
.field private A:I

.field private B:I

.field private C:[I

.field private D:I

.field private E:J

.field private F:Lch/a;

.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:B

.field private o:B

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(IIIIIIIIIII[I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x28

    .line 5
    .line 6
    iput v0, p0, Lch/b;->m:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    iput-byte v0, p0, Lch/b;->n:B

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    iput-byte v0, p0, Lch/b;->o:B

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    iput v1, p0, Lch/b;->y:I

    .line 16
    .line 17
    iput v0, p0, Lch/b;->z:I

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    iput v0, p0, Lch/b;->A:I

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    iput v0, p0, Lch/b;->B:I

    .line 25
    .line 26
    const/16 v0, 0x40

    .line 27
    .line 28
    iput v0, p0, Lch/b;->D:I

    .line 29
    .line 30
    iput p1, p0, Lch/b;->a:I

    .line 31
    .line 32
    iput p4, p0, Lch/b;->d:I

    .line 33
    .line 34
    iput p6, p0, Lch/b;->e:I

    .line 35
    .line 36
    iput p7, p0, Lch/b;->f:I

    .line 37
    .line 38
    iput p8, p0, Lch/b;->g:I

    .line 39
    .line 40
    iput p9, p0, Lch/b;->h:I

    .line 41
    .line 42
    iput p2, p0, Lch/b;->b:I

    .line 43
    .line 44
    iput p3, p0, Lch/b;->c:I

    .line 45
    .line 46
    mul-int p6, p2, p3

    .line 47
    .line 48
    iput p6, p0, Lch/b;->q:I

    .line 49
    .line 50
    iput-object p12, p0, Lch/b;->C:[I

    .line 51
    .line 52
    iput p5, p0, Lch/b;->i:I

    .line 53
    .line 54
    iput p10, p0, Lch/b;->j:I

    .line 55
    .line 56
    iput p11, p0, Lch/b;->k:I

    .line 57
    .line 58
    div-int/lit16 p3, p3, 0x80

    .line 59
    .line 60
    int-to-double p7, p3

    .line 61
    invoke-static {p7, p8}, Ljava/lang/Math;->ceil(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide p7

    .line 65
    double-to-int p3, p7

    .line 66
    iput p3, p0, Lch/b;->l:I

    .line 67
    .line 68
    invoke-static {p1}, Lch/g;->b(I)I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    iput p3, p0, Lch/b;->p:I

    .line 73
    .line 74
    iput p4, p0, Lch/b;->s:I

    .line 75
    .line 76
    invoke-static {p1}, Lch/g;->a(I)I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    iput p3, p0, Lch/b;->r:I

    .line 81
    .line 82
    invoke-static {p4}, Lch/g;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    iput p3, p0, Lch/b;->t:I

    .line 87
    .line 88
    invoke-static {p2}, Lch/g;->b(I)I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    iput p3, p0, Lch/b;->u:I

    .line 93
    .line 94
    invoke-static {p6}, Lch/g;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    iput p3, p0, Lch/b;->v:I

    .line 99
    .line 100
    invoke-static {p6}, Lch/g;->b(I)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    iput p3, p0, Lch/b;->w:I

    .line 105
    .line 106
    invoke-static {p2}, Lch/g;->b(I)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iput p2, p0, Lch/b;->x:I

    .line 111
    .line 112
    int-to-long p2, p1

    .line 113
    const-wide/16 p4, 0x40

    .line 114
    .line 115
    rem-long/2addr p2, p4

    .line 116
    long-to-int p2, p2

    .line 117
    const-wide/16 p3, 0x1

    .line 118
    .line 119
    shl-long p5, p3, p2

    .line 120
    .line 121
    sub-long/2addr p5, p3

    .line 122
    iput-wide p5, p0, Lch/b;->E:J

    .line 123
    .line 124
    new-instance p2, Lch/a;

    .line 125
    .line 126
    iget p3, p0, Lch/b;->r:I

    .line 127
    .line 128
    invoke-direct {p2, p3, p1, p5, p6}, Lch/a;-><init>(IIJ)V

    .line 129
    .line 130
    .line 131
    iput-object p2, p0, Lch/b;->F:Lch/a;

    .line 132
    .line 133
    return-void
.end method
