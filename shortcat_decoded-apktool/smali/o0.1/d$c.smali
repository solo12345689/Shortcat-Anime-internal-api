.class final Lo0/d$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/d;->w0(Lo0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo0/b;


# direct methods
.method constructor <init>(Lo0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/d$c;->a:Lo0/b;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lo0/d;)LK0/H0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getNode()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p1, LK0/H0;->b:LK0/H0;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lo0/d;->H1(Lo0/d;)Lo0/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lo0/d$c;->a:Lo0/b;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lo0/f;->w0(Lo0/b;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lo0/d;->J1(Lo0/d;Lo0/f;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lo0/d;->I1(Lo0/d;Lo0/d;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, LK0/H0;->a:LK0/H0;

    .line 33
    .line 34
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo0/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo0/d$c;->a(Lo0/d;)LK0/H0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
