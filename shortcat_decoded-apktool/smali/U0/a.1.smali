.class public final synthetic LU0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:LU0/R0;


# direct methods
.method public synthetic constructor <init>(LU0/R0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/a;->a:LU0/R0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/a;->a:LU0/R0;

    .line 2
    .line 3
    check-cast p1, Landroid/graphics/RectF;

    .line 4
    .line 5
    check-cast p2, Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, LU0/b;->E(LU0/R0;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
