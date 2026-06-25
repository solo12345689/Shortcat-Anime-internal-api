.class public final LCd/g$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lzd/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g;-><init>(Lxd/g;Lud/a;Ljava/util/Set;LGf/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCd/g;


# direct methods
.method constructor <init>(LCd/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/g$b;->a:LCd/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LCd/e;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LCd/g$b;->a:LCd/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, LCd/g;->b(LCd/g;LCd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LCd/g$b;->a:LCd/g;

    .line 2
    .line 3
    invoke-static {v0}, LCd/g;->c(LCd/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()LCd/h;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/g$b;->a:LCd/g;

    .line 2
    .line 3
    invoke-static {v0}, LCd/g;->a(LCd/g;)LCd/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
