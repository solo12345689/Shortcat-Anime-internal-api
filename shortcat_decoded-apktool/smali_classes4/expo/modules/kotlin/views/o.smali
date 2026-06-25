.class public final synthetic Lexpo/modules/kotlin/views/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lexpo/modules/kotlin/views/p;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/views/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/views/o;->a:Lexpo/modules/kotlin/views/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/o;->a:Lexpo/modules/kotlin/views/p;

    .line 2
    .line 3
    check-cast p1, Landroid/content/Context;

    .line 4
    .line 5
    check-cast p2, LUb/d;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lexpo/modules/kotlin/views/p;->a(Lexpo/modules/kotlin/views/p;Landroid/content/Context;LUb/d;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
