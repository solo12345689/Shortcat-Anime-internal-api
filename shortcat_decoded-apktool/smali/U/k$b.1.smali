.class final LU/k$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/k;->a(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:LC/A;

.field final synthetic c:Lie/o;


# direct methods
.method constructor <init>(JLC/A;Lie/o;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LU/k$b;->a:J

    .line 2
    .line 3
    iput-object p3, p0, LU/k$b;->b:LC/A;

    .line 4
    .line 5
    iput-object p4, p0, LU/k$b;->c:Lie/o;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
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

    invoke-virtual {p0, p1, p2}, LU/k$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

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

    const-string v1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)"

    const v2, 0x3902db2e

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    iget-wide v3, p0, LU/k$b;->a:J

    .line 6
    sget-object p2, LU/D;->a:LU/D;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LU/D;->c(LY/m;I)LU/o0;

    move-result-object p2

    invoke-virtual {p2}, LU/o0;->k()LU0/Y0;

    move-result-object v5

    .line 7
    new-instance p2, LU/k$b$a;

    iget-object v0, p0, LU/k$b;->b:LC/A;

    iget-object v1, p0, LU/k$b;->c:Lie/o;

    invoke-direct {p2, v0, v1}, LU/k$b$a;-><init>(LC/A;Lie/o;)V

    const/16 v0, 0x36

    const v1, 0x4f204156

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v6

    const/16 v8, 0x180

    move-object v7, p1

    .line 8
    invoke-static/range {v3 .. v8}, LW/f;->a(JLU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
