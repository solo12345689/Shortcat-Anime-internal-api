.class final Landroidx/compose/ui/platform/U$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/U;->A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/S;

.field final synthetic b:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/S;Landroid/view/Choreographer$FrameCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/U$a;->a:Landroidx/compose/ui/platform/S;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/U$a;->b:Landroid/view/Choreographer$FrameCallback;

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

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/U$a;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/platform/U$a;->a:Landroidx/compose/ui/platform/S;

    iget-object v0, p0, Landroidx/compose/ui/platform/U$a;->b:Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/S;->p2(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
