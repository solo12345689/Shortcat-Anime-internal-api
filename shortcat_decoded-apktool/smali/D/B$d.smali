.class public final LD/B$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/B;-><init>(IILD/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD/B;


# direct methods
.method constructor <init>(LD/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/B$d;->a:LD/B;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)Landroidx/compose/foundation/lazy/layout/d$b;
    .locals 7

    .line 1
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 2
    .line 3
    iget-object v1, p0, LD/B$d;->a:LD/B;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/l$a;->d()Li0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, v2}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :try_start_0
    invoke-static {v1}, LD/B;->g(LD/B;)LY/C0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, LY/C0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, LD/s;

    .line 30
    .line 31
    invoke-virtual {v1}, LD/s;->l()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    invoke-virtual {v0, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, LD/B$d;->a:LD/B;

    .line 39
    .line 40
    invoke-virtual {v0}, LD/B;->A()Landroidx/compose/foundation/lazy/layout/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p1, v5, v6}, Landroidx/compose/foundation/lazy/layout/d;->e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {v0, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
