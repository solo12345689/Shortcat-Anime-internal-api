.class final Lwd/o$i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/o$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwd/o;


# direct methods
.method constructor <init>(Lwd/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwd/o$i$a;->a:Lwd/o;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lwd/i$a;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p2, p0, Lwd/o$i$a;->a:Lwd/o;

    .line 2
    .line 3
    invoke-static {p2}, Lwd/o;->e(Lwd/o;)Lwd/o$b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, Lwd/i$a;->a()Lrd/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lwd/i$a;->c()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1}, Lwd/i$a;->b()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p1}, Lwd/i$a;->d()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-interface {p2, v0, v1, v2, p1}, Lwd/o$b;->j(Lrd/a;III)V

    .line 24
    .line 25
    .line 26
    sget-object p1, LTd/L;->a:LTd/L;

    .line 27
    .line 28
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lwd/i$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lwd/o$i$a;->a(Lwd/i$a;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
