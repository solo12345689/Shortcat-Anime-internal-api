.class final LE0/e$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/e;->b(JLjava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/e;

.field final synthetic b:Landroidx/compose/ui/e$c;


# direct methods
.method constructor <init>(LE0/e;Landroidx/compose/ui/e$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE0/e$a;->a:LE0/e;

    .line 2
    .line 3
    iput-object p2, p0, LE0/e$a;->b:Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE0/e$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, LE0/e$a;->a:LE0/e;

    iget-object v1, p0, LE0/e$a;->b:Landroidx/compose/ui/e$c;

    invoke-static {v0, v1}, LE0/e;->a(LE0/e;Landroidx/compose/ui/e$c;)V

    return-void
.end method
