.class Lrh/c$o;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "o"
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
    invoke-direct {p0}, Lrh/c$o;-><init>()V

    return-void
.end method

.method private b(LDg/b;[B)Lih/d;
    .locals 1

    .line 1
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, LDg/a;->l()Lzg/t;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lrh/e;->x(Lzg/t;)Lih/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Lih/d;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lih/d;-><init>(Lih/b;[B)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 1

    .line 1
    invoke-virtual {p1}, LDg/b;->p()Lzg/b;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lzg/b;->D()[B

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2}, Lrh/e;->B([B)Lzg/u;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p0, p1, p2}, Lrh/c$o;->b(LDg/b;[B)Lih/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-direct {p0, p1, p2}, Lrh/c$o;->b(LDg/b;[B)Lih/d;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method
