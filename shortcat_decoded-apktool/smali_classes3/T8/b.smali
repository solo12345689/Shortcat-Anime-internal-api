.class public final synthetic LT8/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ8/n;


# instance fields
.field public final synthetic a:LR8/t;


# direct methods
.method public synthetic constructor <init>(LR8/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT8/b;->a:LR8/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, LT8/e;

    .line 2
    .line 3
    check-cast p2, Ln9/j;

    .line 4
    .line 5
    sget v0, LT8/d;->n:I

    .line 6
    .line 7
    invoke-virtual {p1}, LR8/c;->C()Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, LT8/a;

    .line 12
    .line 13
    iget-object v0, p0, LT8/b;->a:LR8/t;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LT8/a;->K3(LR8/t;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p2, p1}, Ln9/j;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
