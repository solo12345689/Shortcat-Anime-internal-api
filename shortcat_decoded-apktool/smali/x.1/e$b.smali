.class final Lx/e$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/e;->l(Lp0/f;Ls0/h0;JJZF)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/h0;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lu0/g;


# direct methods
.method constructor <init>(Ls0/h0;JJLu0/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/e$b;->a:Ls0/h0;

    .line 2
    .line 3
    iput-wide p2, p0, Lx/e$b;->b:J

    .line 4
    .line 5
    iput-wide p4, p0, Lx/e$b;->c:J

    .line 6
    .line 7
    iput-object p6, p0, Lx/e$b;->d:Lu0/g;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/c;

    invoke-virtual {p0, p1}, Lx/e$b;->invoke(Lu0/c;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/c;)V
    .locals 12

    .line 2
    invoke-interface {p1}, Lu0/c;->B1()V

    .line 3
    iget-object v1, p0, Lx/e$b;->a:Ls0/h0;

    .line 4
    iget-wide v2, p0, Lx/e$b;->b:J

    .line 5
    iget-wide v4, p0, Lx/e$b;->c:J

    .line 6
    iget-object v7, p0, Lx/e$b;->d:Lu0/g;

    const/16 v10, 0x68

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p1

    .line 7
    invoke-static/range {v0 .. v11}, Lu0/f;->P(Lu0/f;Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void
.end method
