.class final Lx/b0$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/b0$a;->invoke(Landroidx/compose/ui/layout/s$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:I

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/b0$a$a;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput p2, p0, Lx/b0$a$a;->b:I

    .line 4
    .line 5
    iput p3, p0, Lx/b0$a$a;->c:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Lx/b0$a$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 8

    .line 2
    iget-object v1, p0, Lx/b0$a$a;->a:Landroidx/compose/ui/layout/s;

    iget v2, p0, Lx/b0$a$a;->b:I

    iget v3, p0, Lx/b0$a$a;->c:I

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/layout/s$a;->f0(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
