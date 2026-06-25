.class Lrh/c$z;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "z"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lrh/c$y;-><init>(Lrh/c$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lrh/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lrh/c$z;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 3

    .line 1
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, LDg/a;->p()Lzg/e;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2}, LVg/k;->n(Ljava/lang/Object;)LVg/k;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, LVg/k;->p()LDg/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, LVg/p;->l(Ljava/lang/Object;)LVg/p;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lsh/z$b;

    .line 32
    .line 33
    new-instance v2, Lsh/x;

    .line 34
    .line 35
    invoke-virtual {p2}, LVg/k;->l()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {v0}, Lrh/e;->j(Lzg/t;)LFg/j;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v2, p2, v0}, Lsh/x;-><init>(ILFg/j;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v2}, Lsh/z$b;-><init>(Lsh/x;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, LVg/p;->n()[B

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {v1, p2}, Lsh/z$b;->g([B)Lsh/z$b;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1}, LVg/p;->p()[B

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p2, p1}, Lsh/z$b;->h([B)Lsh/z$b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    invoke-virtual {p1}, Lsh/z$b;->e()Lsh/z;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_0
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lzg/u;->B()[B

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Lsh/z$b;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-static {p1, v0}, LOh/g;->a([BI)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {v0}, Lsh/x;->k(I)Lsh/x;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {p2, v0}, Lsh/z$b;-><init>(Lsh/x;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p1}, Lsh/z$b;->f([B)Lsh/z$b;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_0
.end method
