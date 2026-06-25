.class public interface abstract Lx2/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lx2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx2/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lx2/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx2/h;->a:Lx2/h;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(Lw2/o;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/o;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object p0, p0, Lw2/o;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public abstract a(Lw2/o;)Ljava/lang/String;
.end method
