.class final Lq8/b$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lfa/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# static fields
.field static final a:Lq8/b$f;

.field private static final b:Lfa/c;

.field private static final c:Lfa/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq8/b$f;

    .line 2
    .line 3
    invoke-direct {v0}, Lq8/b$f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq8/b$f;->a:Lq8/b$f;

    .line 7
    .line 8
    const-string v0, "networkType"

    .line 9
    .line 10
    invoke-static {v0}, Lfa/c;->d(Ljava/lang/String;)Lfa/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lq8/b$f;->b:Lfa/c;

    .line 15
    .line 16
    const-string v0, "mobileSubtype"

    .line 17
    .line 18
    invoke-static {v0}, Lfa/c;->d(Ljava/lang/String;)Lfa/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lq8/b$f;->c:Lfa/c;

    .line 23
    .line 24
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
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lq8/o;

    .line 2
    .line 3
    check-cast p2, Lfa/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lq8/b$f;->b(Lq8/o;Lfa/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Lq8/o;Lfa/e;)V
    .locals 2

    .line 1
    sget-object v0, Lq8/b$f;->b:Lfa/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq8/o;->c()Lq8/o$c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Lfa/e;->b(Lfa/c;Ljava/lang/Object;)Lfa/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lq8/b$f;->c:Lfa/c;

    .line 11
    .line 12
    invoke-virtual {p1}, Lq8/o;->b()Lq8/o$b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p2, v0, p1}, Lfa/e;->b(Lfa/c;Ljava/lang/Object;)Lfa/e;

    .line 17
    .line 18
    .line 19
    return-void
.end method
