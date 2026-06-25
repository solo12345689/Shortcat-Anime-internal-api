.class public final Lsa/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsa/b$a;
    }
.end annotation


# static fields
.field private static final b:Lsa/b;


# instance fields
.field private final a:Lsa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsa/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lsa/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lsa/b$a;->a()Lsa/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lsa/b;->b:Lsa/b;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(Lsa/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsa/b;->a:Lsa/a;

    .line 5
    .line 6
    return-void
.end method

.method public static b()Lsa/b$a;
    .locals 1

    .line 1
    new-instance v0, Lsa/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lsa/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Lsa/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lsa/b;->a:Lsa/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()[B
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/firebase/messaging/O;->a(Ljava/lang/Object;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
