.class final LG/D$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/D;->k(IFLie/a;LY/m;II)LG/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:F

.field final synthetic c:Lie/a;


# direct methods
.method constructor <init>(IFLie/a;)V
    .locals 0

    .line 1
    iput p1, p0, LG/D$d;->a:I

    .line 2
    .line 3
    iput p2, p0, LG/D$d;->b:F

    .line 4
    .line 5
    iput-object p3, p0, LG/D$d;->c:Lie/a;

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
.method public final a()LG/b;
    .locals 4

    .line 1
    new-instance v0, LG/b;

    .line 2
    .line 3
    iget v1, p0, LG/D$d;->a:I

    .line 4
    .line 5
    iget v2, p0, LG/D$d;->b:F

    .line 6
    .line 7
    iget-object v3, p0, LG/D$d;->c:Lie/a;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LG/b;-><init>(IFLie/a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LG/D$d;->a()LG/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
