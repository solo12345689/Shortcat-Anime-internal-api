.class public interface abstract Lv4/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/b$c$a;
    }
.end annotation


# static fields
.field public static final a:Lv4/b$c$a;

.field public static final b:Lv4/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lv4/b$c$a;->a:Lv4/b$c$a;

    .line 2
    .line 3
    sput-object v0, Lv4/b$c;->a:Lv4/b$c$a;

    .line 4
    .line 5
    new-instance v0, Lv4/c;

    .line 6
    .line 7
    invoke-direct {v0}, Lv4/c;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lv4/b$c;->b:Lv4/b$c;

    .line 11
    .line 12
    return-void
.end method

.method private static a(LG4/h;)Lv4/b;
    .locals 0

    .line 1
    sget-object p0, Lv4/b;->b:Lv4/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LG4/h;)Lv4/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lv4/b$c;->a(LG4/h;)Lv4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public abstract c(LG4/h;)Lv4/b;
.end method
