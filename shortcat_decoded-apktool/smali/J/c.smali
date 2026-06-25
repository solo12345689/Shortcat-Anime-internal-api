.class public abstract LJ/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LJ/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, LJ/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ/c;->a:LJ/b;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(F)LJ/b;
    .locals 1

    .line 1
    new-instance v0, LJ/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LJ/g;-><init>(F)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(I)LJ/b;
    .locals 1

    .line 1
    new-instance v0, LJ/f;

    .line 2
    .line 3
    int-to-float p0, p0

    .line 4
    invoke-direct {v0, p0}, LJ/f;-><init>(F)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final c(F)LJ/b;
    .locals 2

    .line 1
    new-instance v0, LJ/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LJ/d;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
