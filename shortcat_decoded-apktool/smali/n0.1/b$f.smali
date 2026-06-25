.class final Ln0/b$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln0/b;->z(LR0/s;Landroidx/compose/ui/platform/l1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/l1;

.field final synthetic b:Ln0/b;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/l1;Ln0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln0/b$f;->a:Landroidx/compose/ui/platform/l1;

    .line 2
    .line 3
    iput-object p2, p0, Ln0/b$f;->b:Ln0/b;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(ILR0/s;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln0/b$f;->a:Landroidx/compose/ui/platform/l1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/l1;->a()Lt/G;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2}, LR0/s;->q()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lt/q;->a(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ln0/b$f;->b:Ln0/b;

    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Ln0/b;->c(Ln0/b;ILR0/s;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Ln0/b$f;->b:Ln0/b;

    .line 23
    .line 24
    invoke-static {p1}, Ln0/b;->b(Ln0/b;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, LR0/s;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Ln0/b$f;->a(ILR0/s;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method
