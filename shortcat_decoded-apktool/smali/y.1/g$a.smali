.class final Ly/g$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/g;->a(Ly/b;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly/g;

.field final synthetic b:Ly/b;

.field final synthetic c:I


# direct methods
.method constructor <init>(Ly/g;Ly/b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly/g$a;->a:Ly/g;

    .line 2
    .line 3
    iput-object p2, p0, Ly/g$a;->b:Ly/b;

    .line 4
    .line 5
    iput p3, p0, Ly/g$a;->c:I

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

    invoke-virtual {p0, p1, p2}, Ly/g$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 2

    .line 2
    iget-object p2, p0, Ly/g$a;->a:Ly/g;

    iget-object v0, p0, Ly/g$a;->b:Ly/b;

    iget v1, p0, Ly/g$a;->c:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v1

    invoke-virtual {p2, v0, p1, v1}, Ly/g;->a(Ly/b;LY/m;I)V

    return-void
.end method
