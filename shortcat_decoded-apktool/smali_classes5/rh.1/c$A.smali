.class Lrh/c$A;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "A"
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
    invoke-direct {p0}, Lrh/c$A;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 4

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
    invoke-static {p2}, LVg/l;->n(Ljava/lang/Object;)LVg/l;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, LVg/l;->r()LDg/a;

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
    new-instance v1, Lsh/t$b;

    .line 32
    .line 33
    new-instance v2, Lsh/r;

    .line 34
    .line 35
    invoke-virtual {p2}, LVg/l;->l()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {p2}, LVg/l;->p()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-static {v0}, Lrh/e;->j(Lzg/t;)LFg/j;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v2, v3, p2, v0}, Lsh/r;-><init>(IILFg/j;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2}, Lsh/t$b;-><init>(Lsh/r;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, LVg/p;->n()[B

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {v1, p2}, Lsh/t$b;->g([B)Lsh/t$b;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1}, LVg/p;->p()[B

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p2, p1}, Lsh/t$b;->h([B)Lsh/t$b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_0
    invoke-virtual {p1}, Lsh/t$b;->e()Lsh/t;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_0
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lzg/u;->B()[B

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance p2, Lsh/t$b;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-static {p1, v0}, LOh/g;->a([BI)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {v0}, Lsh/r;->i(I)Lsh/r;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-direct {p2, v0}, Lsh/t$b;-><init>(Lsh/r;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, p1}, Lsh/t$b;->f([B)Lsh/t$b;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_0
.end method
