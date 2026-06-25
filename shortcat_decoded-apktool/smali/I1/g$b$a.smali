.class public final LI1/g$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI1/g$b;->j(LI1/g$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI1/g$b;

.field final synthetic b:LI1/u;


# direct methods
.method constructor <init>(LI1/g$b;LI1/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI1/g$b$a;->a:LI1/g$b;

    .line 2
    .line 3
    iput-object p2, p0, LI1/g$b$a;->b:LI1/u;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LI1/g$b$a;->a:LI1/g$b;

    .line 17
    .line 18
    invoke-virtual {p1}, LI1/g$b;->h()LI1/g$d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, LI1/g$d;->a()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, LI1/g$b$a;->a:LI1/g$b;

    .line 29
    .line 30
    iget-object p2, p0, LI1/g$b$a;->b:LI1/u;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, LI1/g$b;->d(LI1/u;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, LI1/g$b$a;->a:LI1/g$b;

    .line 37
    .line 38
    iget-object p2, p0, LI1/g$b$a;->b:LI1/u;

    .line 39
    .line 40
    invoke-static {p1, p2}, LI1/g$b;->c(LI1/g$b;LI1/u;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
