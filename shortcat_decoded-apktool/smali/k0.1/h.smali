.class public final Lk0/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lk0/f;
.implements LZ/f;
.implements LZd/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/h$a;
    }
.end annotation


# static fields
.field public static final b:Lk0/h$a;

.field public static final c:I


# instance fields
.field private final a:LY/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk0/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lk0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk0/h;->b:Lk0/h$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lk0/h;->c:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(LY/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/h;->a:LY/s;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic d(Lk0/h;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk0/h;->e(Lk0/h;Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(Lk0/h;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/h;->a:LY/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY/s;->u1(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    new-instance v0, Lk0/g;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Lk0/g;-><init>(Lk0/h;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lk0/d;->c(Ljava/lang/Throwable;Lie/a;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public a1(LZd/i$c;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LZd/i$b$a;->c(LZd/i$b;LZd/i$c;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p1, p0, Lk0/h;->a:LY/s;

    .line 2
    .line 3
    invoke-virtual {p1}, LY/s;->a1()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getKey()LZd/i$c;
    .locals 1

    .line 1
    sget-object v0, Lk0/h;->b:Lk0/h$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(LZd/i$c;)LZd/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LZd/i$b$a;->b(LZd/i$b;LZd/i$c;)LZd/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public w(LZd/i;)LZd/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LZd/i$b$a;->d(LZd/i$b;LZd/i;)LZd/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public y1(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LZd/i$b$a;->a(LZd/i$b;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
