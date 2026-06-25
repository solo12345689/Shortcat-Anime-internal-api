.class public final synthetic Ljb/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq7/g;


# instance fields
.field public final synthetic a:Ljb/c;


# direct methods
.method public synthetic constructor <init>(Ljb/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljb/a;->a:Ljb/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljb/a;->a:Ljb/c;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Ljb/c;->g(Ljb/c;I[Ljava/lang/String;[I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
