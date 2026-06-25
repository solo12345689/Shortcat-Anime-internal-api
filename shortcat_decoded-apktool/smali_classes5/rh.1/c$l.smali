.class Lrh/c$l;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
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
    invoke-direct {p0}, Lrh/c$l;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 3

    .line 1
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, LVg/f;->p(Ljava/lang/Object;)LVg/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p2, LKh/c;

    .line 10
    .line 11
    invoke-virtual {p1}, LVg/f;->r()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, LVg/f;->s()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1}, LVg/f;->n()LMh/a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, LVg/f;->l()LDg/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, LDg/a;->l()Lzg/t;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lrh/e;->k(Lzg/t;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p2, v0, v1, v2, p1}, LKh/c;-><init>(IILMh/a;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p2
.end method
