.class final LC/Q$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/Q$a;->c(LY/m;I)LC/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/Q;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(LC/Q;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/Q$a$a;->a:LC/Q;

    .line 2
    .line 3
    iput-object p2, p0, LC/Q$a$a;->b:Landroid/view/View;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(LY/Y;)LY/X;
    .locals 2

    .line 2
    iget-object p1, p0, LC/Q$a$a;->a:LC/Q;

    iget-object v0, p0, LC/Q$a$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, LC/Q;->h(Landroid/view/View;)V

    .line 3
    iget-object p1, p0, LC/Q$a$a;->a:LC/Q;

    iget-object v0, p0, LC/Q$a$a;->b:Landroid/view/View;

    .line 4
    new-instance v1, LC/Q$a$a$a;

    invoke-direct {v1, p1, v0}, LC/Q$a$a$a;-><init>(LC/Q;Landroid/view/View;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, LC/Q$a$a;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
