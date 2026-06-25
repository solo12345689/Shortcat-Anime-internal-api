.class public final LG2/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LG2/d;


# instance fields
.field private final a:Lw2/g$a;


# direct methods
.method public constructor <init>(Lw2/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG2/b;->a:Lw2/g$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)Lw2/g;
    .locals 0

    .line 1
    iget-object p1, p0, LG2/b;->a:Lw2/g$a;

    .line 2
    .line 3
    invoke-interface {p1}, Lw2/g$a;->a()Lw2/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
