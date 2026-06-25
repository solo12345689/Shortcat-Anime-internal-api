.class final LQ/a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a;->b(LQ/i;ZLg1/i;ZJLandroidx/compose/ui/e;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/A1;

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:LQ/i;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/A1;JZLandroidx/compose/ui/e;LQ/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/a$b;->a:Landroidx/compose/ui/platform/A1;

    .line 2
    .line 3
    iput-wide p2, p0, LQ/a$b;->b:J

    .line 4
    .line 5
    iput-boolean p4, p0, LQ/a$b;->c:Z

    .line 6
    .line 7
    iput-object p5, p0, LQ/a$b;->d:Landroidx/compose/ui/e;

    .line 8
    .line 9
    iput-object p6, p0, LQ/a$b;->e:LQ/i;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LQ/a$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 6

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)"

    const v2, 0x10b320d1

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/w0;->r()LY/b1;

    move-result-object p2

    iget-object v0, p0, LQ/a$b;->a:Landroidx/compose/ui/platform/A1;

    invoke-virtual {p2, v0}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    move-result-object p2

    new-instance v0, LQ/a$b$a;

    iget-wide v1, p0, LQ/a$b;->b:J

    iget-boolean v3, p0, LQ/a$b;->c:Z

    iget-object v4, p0, LQ/a$b;->d:Landroidx/compose/ui/e;

    iget-object v5, p0, LQ/a$b;->e:LQ/i;

    invoke-direct/range {v0 .. v5}, LQ/a$b$a;-><init>(JZLandroidx/compose/ui/e;LQ/i;)V

    const/16 v1, 0x36

    const v2, -0x5505aa6f

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    sget v1, LY/c1;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
