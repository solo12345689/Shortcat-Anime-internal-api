.class final Landroidx/compose/ui/platform/P$c$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/R0;

.field final synthetic b:Landroidx/compose/ui/platform/P;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/R0;Landroidx/compose/ui/platform/P;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/P$c$a;->a:Landroidx/compose/ui/platform/R0;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/P$c$a;->b:Landroidx/compose/ui/platform/P;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/P$c$a;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/platform/P$c$a;->a:Landroidx/compose/ui/platform/R0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/R0;->d()V

    .line 3
    iget-object p1, p0, Landroidx/compose/ui/platform/P$c$a;->b:Landroidx/compose/ui/platform/P;

    invoke-static {p1}, Landroidx/compose/ui/platform/P;->d(Landroidx/compose/ui/platform/P;)La1/W;

    move-result-object p1

    invoke-virtual {p1}, La1/W;->f()V

    return-void
.end method
