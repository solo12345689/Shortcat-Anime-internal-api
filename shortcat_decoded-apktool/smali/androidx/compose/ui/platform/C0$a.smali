.class final Landroidx/compose/ui/platform/C0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/C0;->c(Ljava/lang/String;LP3/i;)Landroidx/compose/ui/platform/A0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LP3/f;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLP3/f;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/platform/C0$a;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/C0$a;->b:LP3/f;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/platform/C0$a;->c:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/C0$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-boolean v0, p0, Landroidx/compose/ui/platform/C0$a;->a:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/C0$a;->b:LP3/f;

    iget-object v1, p0, Landroidx/compose/ui/platform/C0$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, LP3/f;->e(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
