.class public interface abstract Lz/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/d$a;
    }
.end annotation


# static fields
.field public static final a:Lz/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lz/d$a;->a:Lz/d$a;

    .line 2
    .line 3
    sput-object v0, Lz/d;->a:Lz/d$a;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a(FFF)F
    .locals 1

    .line 1
    sget-object v0, Lz/d;->a:Lz/d$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lz/d$a;->a(FFF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b()Lw/i;
    .locals 1

    .line 1
    sget-object v0, Lz/d;->a:Lz/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz/d$a;->c()Lw/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
