.class public final synthetic Ld1/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/p;


# instance fields
.field public final synthetic a:Ld1/e;


# direct methods
.method public synthetic constructor <init>(Ld1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/d;->a:Ld1/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/d;->a:Ld1/e;

    .line 2
    .line 3
    check-cast p1, LY0/u;

    .line 4
    .line 5
    check-cast p2, LY0/L;

    .line 6
    .line 7
    check-cast p3, LY0/H;

    .line 8
    .line 9
    check-cast p4, LY0/I;

    .line 10
    .line 11
    invoke-static {v0, p1, p2, p3, p4}, Ld1/e;->b(Ld1/e;LY0/u;LY0/L;LY0/H;LY0/I;)Landroid/graphics/Typeface;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
