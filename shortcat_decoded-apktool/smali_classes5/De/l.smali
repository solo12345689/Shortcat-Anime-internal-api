.class public final LDe/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LNe/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDe/l$a;
    }
.end annotation


# static fields
.field public static final a:LDe/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LDe/l;

    .line 2
    .line 3
    invoke-direct {v0}, LDe/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LDe/l;->a:LDe/l;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LOe/l;)LNe/a;
    .locals 1

    .line 1
    const-string v0, "javaElement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LDe/l$a;

    .line 7
    .line 8
    check-cast p1, LEe/u;

    .line 9
    .line 10
    invoke-direct {v0, p1}, LDe/l$a;-><init>(LEe/u;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
