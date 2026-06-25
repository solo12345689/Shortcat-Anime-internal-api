.class final LK0/e0$j;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/e0;->l3(Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/e0;

.field final synthetic b:Landroidx/compose/ui/e$c;

.field final synthetic c:LK0/e0$f;

.field final synthetic d:J

.field final synthetic e:LK0/w;

.field final synthetic f:I

.field final synthetic g:Z

.field final synthetic h:F

.field final synthetic i:Z


# direct methods
.method constructor <init>(LK0/e0;Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0$j;->a:LK0/e0;

    .line 2
    .line 3
    iput-object p2, p0, LK0/e0$j;->b:Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    iput-object p3, p0, LK0/e0$j;->c:LK0/e0$f;

    .line 6
    .line 7
    iput-wide p4, p0, LK0/e0$j;->d:J

    .line 8
    .line 9
    iput-object p6, p0, LK0/e0$j;->e:LK0/w;

    .line 10
    .line 11
    iput p7, p0, LK0/e0$j;->f:I

    .line 12
    .line 13
    iput-boolean p8, p0, LK0/e0$j;->g:Z

    .line 14
    .line 15
    iput p9, p0, LK0/e0$j;->h:F

    .line 16
    .line 17
    iput-boolean p10, p0, LK0/e0$j;->i:Z

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/e0$j;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 10

    .line 2
    iget-object v0, p0, LK0/e0$j;->a:LK0/e0;

    .line 3
    iget-object v1, p0, LK0/e0$j;->b:Landroidx/compose/ui/e$c;

    .line 4
    iget-object v2, p0, LK0/e0$j;->c:LK0/e0$f;

    invoke-interface {v2}, LK0/e0$f;->a()I

    move-result v2

    const/4 v3, 0x2

    .line 5
    invoke-static {v3}, LK0/g0;->a(I)I

    move-result v3

    .line 6
    invoke-static {v1, v2, v3}, LK0/f0;->b(LK0/j;II)Landroidx/compose/ui/e$c;

    move-result-object v1

    .line 7
    iget-object v2, p0, LK0/e0$j;->c:LK0/e0$f;

    .line 8
    iget-wide v3, p0, LK0/e0$j;->d:J

    .line 9
    iget-object v5, p0, LK0/e0$j;->e:LK0/w;

    .line 10
    iget v6, p0, LK0/e0$j;->f:I

    .line 11
    iget-boolean v7, p0, LK0/e0$j;->g:Z

    .line 12
    iget v8, p0, LK0/e0$j;->h:F

    .line 13
    iget-boolean v9, p0, LK0/e0$j;->i:Z

    .line 14
    invoke-static/range {v0 .. v9}, LK0/e0;->l2(LK0/e0;Landroidx/compose/ui/e$c;LK0/e0$f;JLK0/w;IZFZ)V

    return-void
.end method
